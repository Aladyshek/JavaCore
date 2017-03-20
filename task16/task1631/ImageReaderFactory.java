package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by locuser on 09.02.2017.
 */
public class ImageReaderFactory {
 public static ImageReader getImageReader(ImageTypes a)
    {
        if (a == ImageTypes.JPG)
        {
            return new JpgReader();
        }
        else if (a == ImageTypes.PNG)
            {
             return new PngReader();
            }
            else if (a == ImageTypes.BMP)
                {
                    return new BmpReader();
                }

                else
                {

                    throw new IllegalArgumentException("Неизвестный тип картинки");
                }


    }
}
