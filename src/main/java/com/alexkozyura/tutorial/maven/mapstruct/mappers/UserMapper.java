package com.alexkozyura.tutorial.maven.mapstruct.mappers;

import com.alexkozyura.tutorial.maven.mapstruct.domain.User;
import com.alexkozyura.tutorial.maven.mapstruct.model.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}
