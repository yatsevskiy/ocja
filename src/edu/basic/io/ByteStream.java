package edu.basic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class ByteStream
{
    private static final Logger log = Logger.getAnonymousLogger();

    private static void input() throws IOException
    {
        File inputFile0 = new File("input0.txt");
        File inputFile1 = new File("input1.txt");

        FileInputStream fileInputStream0 = new FileInputStream(inputFile0);
        FileInputStream fileInputStream1 = new FileInputStream(inputFile1);

        int fileSize0 = fileInputStream0.available();

        log.info("size = " + fileSize0);

        for (int i = 0; i < fileSize0; ++i)
        {
            log.info("byte #" + i + " = " + Integer.toString(fileInputStream0.read()));
        }
        fileInputStream0.close();

        int fileSize1 = fileInputStream1.available();
        log.info("size = " + fileSize1);

        byte[] buffer = new byte[fileSize1];
        fileInputStream1.read(buffer);
        log.info(buffer.toString());
        fileInputStream1.close();
    }

    private static void output() throws IOException
    {
        File outputFile0 = new File("output0.txt");
        File outputFile1 = new File("output1.txt");
        File outputFile2 = new File("output2.txt");

        FileOutputStream fileOutputStream0 = new FileOutputStream(outputFile0);
        FileOutputStream fileOutputStream1 = new FileOutputStream(outputFile1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(outputFile2);

        String source = "A star is a massive, luminous ball of plasma held together by gravity. The nearest star to Earth is the Sun, which is the source of most of the energy on Earth. Other stars are visible from Earth during the night when they are not outshone by the Sun or blocked by atmospheric phenomena. Historically, the most prominent stars on the celestial sphere were grouped together into constellations and asterisms, and the brightest stars gained proper names. Extensive catalogues of stars have been assembled by astronomers, which provide standardized star designations. For at least a portion of its life, a star shines due to thermonuclear fusion of hydrogen in its core releasing energy that traverses the star's interior and then radiates into outer space. Almost all naturally occurring elements heavier than helium were created by stars, either via stellar nucleosynthesis during their lifetimes or by supernova nucleosynthesis when stars explode. Astronomers can determine the mass, age, chemical composition and many other properties of a star by observing its spectrum, luminosity and motion through space. The total mass of a star is the principal determinant in its evolution and eventual fate. Other characteristics of a star are determined by its evolutionary history, including diameter, rotation, movement and temperature. A plot of the temperature of many stars against their luminosities, known as a Hertzsprung-Russell diagram (H–R diagram), allows the age and evolutionary state of a star to be determined. A star begins as a collapsing cloud of material composed primarily of hydrogen, along with helium and trace amounts of heavier elements. Once the stellar core is sufficiently dense, some of the hydrogen is steadily converted into helium through the process of nuclear fusion. The remainder of the star's interior carries energy away from the core through a combination of radiative and convective processes. The star's internal pressure prevents it from collapsing further under its own gravity. Once the hydrogen fuel at the core is exhausted, those stars having at least 0.4 times the mass of the Sun expand to become a red giant, in some cases fusing heavier elements at the core or in shells around the core. The star then evolves into a degenerate form, recycling a portion of the matter into the interstellar environment, where it will form a new generation of stars with a higher proportion of heavy elements.";

        byte[] buffer = source.getBytes();
        int bufferSize = buffer.length;
        for (int i = 0; i < bufferSize; ++i)
        {
            fileOutputStream0.write(buffer[i]);
        }
        fileOutputStream0.close();

        fileOutputStream1.write(buffer);
        fileOutputStream1.close();

        fileOutputStream2.write(buffer, bufferSize - bufferSize / 4, bufferSize / 4);
        fileOutputStream2.close();
    }

    public static void main(String[] args) throws IOException
    {
        input();
        output();
    }
}
