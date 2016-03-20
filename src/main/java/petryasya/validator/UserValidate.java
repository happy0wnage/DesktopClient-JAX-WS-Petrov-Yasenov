package petryasya.validator;

import petryasya.core.user.User;

public class UserValidate {

    public static final boolean isCorrect(User user) {
        if("".equals(user.getEmail()) || "".equals(user.getPassword())) {
            return false;
        }
        return true;
    }
}
