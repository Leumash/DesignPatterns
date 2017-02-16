import java.io.*;

public class UpperCaseInputStream extends FilterInputStream {
    public UpperCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int val = in.read();
        return (val == -1 ? val : Character.toUpperCase((char)val));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset+result; i++) {
            b[i] = (byte)Character.toUpperCase((char)b[i]);
        }
        return result;
    }
}

