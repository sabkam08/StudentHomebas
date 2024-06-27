package za.ac.cput.factory;

import za.ac.cput.domain.Admin;
import za.ac.cput.domain.Contact;
import za.ac.cput.util.AdminHelper;

import java.time.LocalDate;

public class AdminFactory {
        public static Admin buildAdmin(long adminId, String firstName, String lastName, String gender,
                                       LocalDate dateOfBirth, String password, Contact contact) {
            if (adminId <= 0 || AdminHelper.isNullOrEmpty(firstName)
                    || AdminHelper.isNullOrEmpty(lastName)
                    || AdminHelper.isNullOrEmpty(gender)
                    || AdminHelper.isValidDate(dateOfBirth)
                    || AdminHelper.isNullOrEmpty(password)
                    || AdminHelper.isContactNull(contact)) {
                return null;
            }

            return new Admin.Builder()
                    .setAdminId(adminId)
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setGender(gender)
                    .setDateOfBirth(dateOfBirth)
                    .setPassword(password)
                    .setContact(contact)
                    .build();
        }
    }


