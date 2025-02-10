package alik.gym_app.config;


import alik.gym_app.service.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JwtFilter {

    @Autowired
    private JWTService jwtService;

}
