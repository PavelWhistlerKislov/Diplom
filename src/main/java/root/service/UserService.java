package root.service;

import root.domain.model.User;

public interface UserService {
    /**
     * Метод для создания новых пользователей с генерацией id
     *
     * @return Свежесозданный пользователь с присвоенным айди.
     */
    User createNewUser();
}
