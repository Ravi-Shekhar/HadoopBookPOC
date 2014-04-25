package hadoop.book.pig;

import java.io.IOException;

import org.apache.pig.FilterFunc;
import org.apache.pig.backend.executionengine.ExecException;
import org.apache.pig.data.Tuple;

public class IsGoodQuality extends FilterFunc {

	@Override
	public Boolean exec(Tuple tuple) throws IOException {
		if(tuple == null || tuple.size() == 0){
			return false;
		}
		try {
			Object object = tuple.get(0);
			if(object == null){
				return false;
			}
			int value = (Integer) object;
			return value == 0 || value == 1 || value == 4 ||value == 5 ||value == 9 ;
		} catch (ExecException e) {
			throw new IOException(e);
		}		
	}
}
