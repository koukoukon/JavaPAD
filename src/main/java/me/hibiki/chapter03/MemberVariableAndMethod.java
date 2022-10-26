package me.hibiki.chapter03;

/**
 * @author koukoukon
 * @date 2022/9/28 15:35
 */
public class MemberVariableAndMethod {

}

class Camera {
    int numOfPhotos;

    public void incrementPhotos() {
        numOfPhotos++;
    }

    public void clickButton() {
        incrementPhotos();
    }
}

class Robot {
    Camera camera;

    public void takePhotos() {
        camera = new Camera();
        camera.incrementPhotos();
        camera.clickButton();
    }
}