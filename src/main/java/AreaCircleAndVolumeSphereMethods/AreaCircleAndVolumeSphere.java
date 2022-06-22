package AreaCircleAndVolumeSphereMethods;

public class AreaCircleAndVolumeSphere {

    public float areaOfCircleMethod(int radius) {

        return (float) (3.14 * (radius * radius));
    }

    public float volumeSphereMethod(int radius) {
        return (float) (1.333 * 3.14 * (radius * radius * radius));
    }
}