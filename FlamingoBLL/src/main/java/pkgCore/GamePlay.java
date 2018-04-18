package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import pkgEnum.eGameType;

public abstract class GamePlay {

	private eGameType eGameType;
	private HashMap<UUID, Player> hmGamePlayers = new HashMap<UUID,Player>();
	
	public GamePlay(eGameType eGameType)
	{
		super();
		this.eGameType = eGameType;
	}
	
	protected void AddPlayersToGame(ArrayList<Player> Players)
	{
		//TODO: Implement this method
		for (Player p:Players) {
			hmGamePlayers.put(p.getPlayerID(), p);
		}
	}
	protected void RemovePlayerFromGame(Player p)
	{
		//TODO: Implement this method	
		this.hmGamePlayers.remove(p.getPlayerID());
	}
	protected Player GetPlayerInGame(Player p)
	{
		//TODO: Implement this method	
		return hmGamePlayers.get(p.getPlayerID());
	}
}
