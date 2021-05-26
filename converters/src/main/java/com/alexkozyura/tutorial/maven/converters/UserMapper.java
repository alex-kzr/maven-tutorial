package com.alexkozyura.tutorial.maven.converters;

import com.alexkozyura.tutorial.maven.entities.User;
import com.alexkozyura.tutorial.maven.jaxb.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);

}
