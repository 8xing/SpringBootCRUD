package com.xing.demo.vo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.HashMap;
import java.util.Map;
import java.util.Date;

public class JwtUtils {
    //设置token过期时间-15分钟
    private static final long EXPIRE_TIME = 15 * 60 * 1000;
    //设置token私钥
    private static final String SECRET_KEY = "hno2321";

    /*
     * 生成签名
     * 　 　*/
    public static String sign(String username, String password) {
        try {
            // 设置过期时间
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            // 私钥和加密算法
            Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
            // 设置头部信息
            Map<String, Object> header = new HashMap<>(2);
            header.put("Type", "Jwt");
            header.put("alg", "HS256");
            // 返回token字符串
            return JWT.create()
                    .withHeader(header)
                    .withClaim("username", username)
                    .withClaim("pwd", password)
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 检验token是否正确
     * @param **token**
     * @return
     */
    public static boolean verify(String token,String username,String password){
        try {
            Algorithm algorithm = Algorithm.HMAC256(password+SECRET_KEY);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withClaim("username",username)
                    .build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (Exception e){
            return false;
        }
    }
    /**
     * 从token中获取username信息,无需解密
     * @param **token**
     * @return
     */
    public static String getUserName(String token){
        try {
            DecodedJWT jwt = JWT.decode(token);
            if(System.currentTimeMillis()-jwt.getExpiresAt().getTime()>0){
                return null;
            }
            return jwt.getClaim("loginName").asString();
        } catch (JWTDecodeException e){
            e.printStackTrace();
            return null;
        }
    }
}