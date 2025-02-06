package my.app.first_project.dto;

import lombok.*;

@Getter
@Setter
@ToString
public class UserData {
    private String userName;
    private int userAge;
    private String userAddress;
//
//    public UserData(String userName, int userAge) {
//        this.userName = userName;
//        this.userAge = userAge;
//    }


    //    getter, setter, 생성자, toString 제거햇음
//    기본생성자, 전체생성자, 일부생성자

//    @AllArgsConstructor
//    위랑 밑에 생성자랑 같음 (롬복이 해줌)
//    public UserData(String userName, int userAge, String userAddress) {
//        this.userName = userName;
//        this.userAge = userAge;
//        this.userAddress = userAddress;
//    }

//    @NoArgsConstructor
//    위랑 밑이랑 같음
//    public UserData() {
//    }

//    @RequiredArgsConstructor
//    위랑 밑이랑 같음  생성자 중에 1개만 갖고있는애 2개만 갖고있는애
//    public UserData(String userName) {
//        this.userName = userName;
//    }
//    public UserData(String userName, int userAge) {
//        this.userName = userName;
//        this.userAge = userAge;
//    }

//    @Getter
//    @Setter
//    @Data = getter, setter, reqargcon, tostr, equal.....
//    @ToString
//    @EqualsAndHashCode
}