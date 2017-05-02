package com.ustb.imagerecognition;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 * Created by Coder on 2017/4/25.
 */
public class OpenCV {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    public static void main(String[]args) {
        Mat m  = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("m = " + m.dump());

        String fileLocation = "image/test.jpg";
        Mat image = Imgcodecs.imread(fileLocation);
        Imgproc.cvtColor(image, image, Imgproc.COLOR_BGR2GRAY);
        Imgcodecs.imwrite("image_dispose/result.jpg", image);
    }
}
