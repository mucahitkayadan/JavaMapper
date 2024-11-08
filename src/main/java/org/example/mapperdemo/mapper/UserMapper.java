package org.example.mapperdemo.mapper;

import org.example.mapperdemo.dto.request.UserRequestDTO;
import org.example.mapperdemo.dto.response.UserResponseDTO;
import org.example.mapperdemo.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User userRequestDTOToUser(UserRequestDTO userRequestDTO);
    UserResponseDTO userToUserResponseDTO(User user);
}
