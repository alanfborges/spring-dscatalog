package com.alandev.dscatalog.service.validation;

import com.alandev.dscatalog.controllers.exceptions.FieldMessage;
import com.alandev.dscatalog.dto.UserInsertDTO;
import com.alandev.dscatalog.entities.User;
import com.alandev.dscatalog.repositories.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserInsertValidator implements ConstraintValidator<UserInsertValid, UserInsertDTO> {

    @Autowired
    private UserRepository repository;

    @Override
    public void initialize(UserInsertValid constraintAnnotation) {

    }

    @Override
    public boolean isValid(UserInsertDTO userInsertDTO,
                           ConstraintValidatorContext context) {
        List<FieldMessage> list = new ArrayList<>();

        User user = repository.findByEmail(userInsertDTO.getEmail());

        if (user != null) {
            list.add(new FieldMessage("email", "Email já existe"));
        }

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
                    .addConstraintViolation();
        }

        return list.isEmpty();
    }
}
