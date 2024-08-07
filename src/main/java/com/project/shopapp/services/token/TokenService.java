package com.project.shopapp.services.token;

import com.project.shopapp.models.Token;
import com.project.shopapp.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TokenService implements ITokenService{
    @Override
    public Token addToken(User user, String token, boolean isMobileDevice) {
        return null;
    }

    @Override
    public Token refreshToken(String refreshToken, User user) throws Exception {
        return null;
    }
}
