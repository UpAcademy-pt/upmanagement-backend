package pt.upacademy.coreFinalProject.models.converters;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.User;
import pt.upacademy.coreFinalProject.models.DTOS.UserDTO;
import pt.upacademy.coreFinalProject.services.UserService;

@RequestScoped
public class UserConverter extends EntityConverter<User, UserDTO>{

	public User toEntity(UserDTO dto) {
		User userEntity = new User();
		userEntity.setId(dto.getId());
		userEntity.setEmail(dto.getEmail());
		userEntity.setUsername(dto.getUsername());
		String[] passWord = UserService.passwordToHashcode(dto.getPassword());
		userEntity.setHashcode(passWord[0]);
		userEntity.setSalt(passWord[1]);
		//	userEntity.setPassword(dto.getPassword()); // Ver como fazer password
		userEntity.setRole(dto.getRole());
		return userEntity;
	}

	public UserDTO toDTO (User entity) {
		UserDTO userDto = new UserDTO();
		userDto.setId(entity.getId());
		userDto.setEmail(entity.getEmail());
		userDto.setUsername(entity.getUsername());
		userDto.setPassword(null); // Ver como fazer password
		userDto.setRole(entity.getRole());
		return userDto;

	}
	
	public User toNullUser (User user) {
		User userEntity = new User();
		userEntity.setId(user.getId());
		userEntity.setEmail(null);
		userEntity.setUsername(null);
		userEntity.setHashcode(null);
		userEntity.setSalt(null);
		userEntity.setRole(null);
		return userEntity;
	}



}
