package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest {

	@Test
	public void test() {
		Table t = new Table();
		Player p1 = new Player("Sam",6);
		Player p2 = new Player("John",10);
		Player p3 = new Player("Eric",15);
		t.AddPlayerToTable(p1);
		t.AddPlayerToTable(p2);
		t.AddPlayerToTable(p3);
		assertEquals(t.GetPlayerFromTable(p1),p1);
		assertEquals(t.GetPlayerFromTable(p2),p2);
		assertEquals(t.GetPlayerFromTable(p3),p3);
		t.RemovePlayerFromTable(p3);
		assertEquals(t.GetPlayerFromTable(p3),null);
	}

}
