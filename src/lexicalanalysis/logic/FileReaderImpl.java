package lexicalanalysis.logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Tomáš Vondra
 */
public class FileReaderImpl implements ReaderInterface {

    private BufferedReader br;

    public FileReaderImpl(String path) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(path));
    }

    @Override
    public Integer readChar() throws IOException {
        return br.read();
    }

    @Override
    public String readLine() throws IOException {
        return br.readLine();
    }

    @Override
    public String readAll() throws IOException {

        StringBuffer buff = new StringBuffer();
        int c = readChar();
        
        while (c != -1) {
            buff.append(c);
        }
        return buff.toString();
    }

}
