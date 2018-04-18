package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import pkgCore.Player;

public class Table {

	private UUID TableID;
	private HashMap<UUID, Player> hmTablePlayers = new HashMap<UUID,Player>();
	
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	
	public void AddPlayerToTable(Player p)
	{
		//TODO: Implement this method
		this.hmTablePlayers.put(p.getPlayerID(), p);
	}
	public void RemovePlayerFromTable(Player p)
	{
		//TODO: Implement this method	
		this.hmTablePlayers.remove(p.getPlayerID());
	}
	
	public Player GetPlayerFromTable(Player p)
	{
		//TODO: Implement this method	
		return hmTablePlayers.get(p.getPlayerID());
	}
	public void ClearTable()
	{
		//TODO: Implement this method	
		hmTablePlayers.clear();
	}
}
