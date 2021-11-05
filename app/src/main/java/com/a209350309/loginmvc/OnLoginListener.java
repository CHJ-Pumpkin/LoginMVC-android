package com.a209350309.loginmvc;

import java.util.UUID;

public interface OnLoginListener {
    void onSucceed(UUID uid,String username);
    void onError(String error);
}
