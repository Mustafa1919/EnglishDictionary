package spook.interfaces.physical;

import java.util.stream.Stream;

public interface IReadFile extends ICheckFile {

    void startReadFile() throws Exception;

    //boolean ifExistFile(String path) throws Exception;

    Stream readFile() throws Exception;

}
