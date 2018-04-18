package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import pkgEnum.eGameType;

public class GamePlayTest {

	@Test
	public void test() {
		GamePlayBlackJack g = new GamePlayBlackJack(eGameType.BLACKJACK);
		Table t = new Table();
		Player p1 = new Player("Sam",6);
		Player p2 = new Player("John",10);
		Player p3 = new Player("Eric",15);
		ArrayList<Player> Players = new ArrayList<Player>();
		Players.add(p1);
		Players.add(p2);
		Players.add(p3);
		g.AddPlayersToGame(Players);
		assertEquals(g.GetPlayerInGame(p2),p2);
		g.RemovePlayerFromGame(p2);
		assertEquals(g.GetPlayerInGame(p2),null);
	}

}
