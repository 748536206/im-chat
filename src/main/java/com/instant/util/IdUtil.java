package com.instant.util;


public class IdUtil {
    private static IdGenerator idGenerator = new IdGenerator(1000);
    private static Long ID_MIN = 100000L;
    public static Long nextUserId(){
        Long id = idGenerator.nextId() % 1000000;

        if(id < ID_MIN){
            id = nextUserId();
        }
        return id;
    }
}
