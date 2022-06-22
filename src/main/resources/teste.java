import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.catalina.LifecycleListener;
import org.hibernate.mapping.Array;

import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;

public class teste {

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);		
		
		lista.stream()
			.limit(10)
			.filter(t -> t % 2 == 0)
			.map(t -> t * 2)
			.forEach(System.out.println());	
		
		
	}

}
