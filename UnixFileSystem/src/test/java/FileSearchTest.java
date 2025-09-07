import com.practise.comparsion.EqualOperator;
import com.practise.comparsion.RegexMatchOperator;
import com.practise.io.File;
import com.practise.io.FileAttribute;
import com.practise.predicate.AndPredicate;
import com.practise.predicate.SimplePredicate;
import com.practise.search.FileSearch;
import com.practise.search.FileSearchCriteria;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileSearchTest {

    @Test
    public void testFileSearch(){
        final File root = new File(true, 0,"adam","root");
        final File a = new File(false, 2000,"adam","a");
        final File b = new File(false, 3000,"george","b");

        root.addEntry(a);
        root.addEntry(b);



        final FileSearchCriteria criteria = new FileSearchCriteria(new AndPredicate(List.of(
                new SimplePredicate<>(FileAttribute.IS_DIRECTORY,
                        new EqualOperator<>(),false),
                new SimplePredicate<>(FileAttribute.OWNER,
                        new RegexMatchOperator<>(),"ge.*"))));

        final FileSearch fileSearch= new FileSearch();
        final List<File> result = fileSearch.search(root, criteria);

        assertEquals(1,result.size());
        assertEquals("b",result.get(0).getFilename());
    }
}
