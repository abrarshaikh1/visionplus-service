package com.visionplus.visionplus.Mappers;

import com.visionplus.visionplus.dto.UserRegDto;
import com.visionplus.visionplus.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );
    User userRegDtoToUser(UserRegDto userRegDto);

}
