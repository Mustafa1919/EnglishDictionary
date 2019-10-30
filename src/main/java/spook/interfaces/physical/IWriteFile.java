package spook.interfaces.physical;

import java.util.stream.Stream;

public interface IWriteFile extends ICheckFile{

    boolean startWriteFile() throws Exception;

    boolean writeFile(Stream writingData) throws Exception;

}
