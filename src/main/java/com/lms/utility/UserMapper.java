//package com.lms.utility;
//
//import com.lms.entity.User;
//import com.lms.entity.UserAddress;
//import com.lms.entity.UserType;
//
//import java.util.stream.Collectors;
//
//public class UserMapper {
//
////    public static UserResponseDTO toUserResponseDTO(User user) {
////        UserResponseDTO dto = new UserResponseDTO();
////        dto.setId(user.getId());
////        dto.setName(user.getName());
////        dto.setEmail(user.getEmail());
////        dto.setMob_no(user.getMob_no());
////        dto.setUserType(user.getUserType());
////        dto.setAddress(user.getAddress().stream()
////                .map(UserMapper::toUserAddressResponseDTO)
////                .collect(Collectors.toList()));
////
////
////        return dto;
////    }
//
//    public static User toUserEntity(UserRequestDTO dto) {
//        User user = new User();
//        user.setName(dto.getName());
//        user.setEmail(dto.getEmail());
//        user.setMob_no(dto.getMob_no());
//        user.setUserType(UserType.valueOf(dto.getUserType()));
//        user.setAddress(dto.getAddresses().stream()
//                .map(UserMapper::toUserAddressEntity)
//                .collect(Collectors.toList()));
//        return user;
//    }
//
//    private static UserAddressResponseDTO toUserAddressResponseDTO(UserAddress address) {
//        UserAddressResponseDTO dto = new UserAddressResponseDTO();
//        dto.setAddress_id(address.getAddress_id());
//        dto.setHouse_no(address.getHouse_no());
//        dto.setCity(address.getCity());
//        dto.setZipcode(address.getZipcode());
//        dto.setStreet(address.getStreet());
//        return dto;
//    }
//
//    private static UserAddress toUserAddressEntity(UserAddressRequestDTO dto) {
//        UserAddress address = new UserAddress();
//        address.setHouse_no(dto.getHouse_no());
//        address.setCity(dto.getCity());
//        address.setZipcode(dto.getZipcode());
//        address.setStreet(dto.getStreet());
//        return address;
//    }
//}
