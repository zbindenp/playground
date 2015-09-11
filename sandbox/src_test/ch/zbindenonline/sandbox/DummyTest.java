package ch.zbindenonline.sandbox;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class DummyTest {

	@Test
	public void sumIs0WhenNoArgIsGiven() {
		assertThat(Dummy.sum(), is(0));
	}

}
