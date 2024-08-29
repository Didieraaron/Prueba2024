public class GameStatistics
{
private int totalGamesWon;
private int totalGamesLost;
private double averaage;

public GameStatistics()
{
totalGamesWon = 0;
totalGamesLost =0;
averaage=0;
}

public GameStatistics(int totalGamesLost, int totalGamesWon)
{
	this.totalGamesLost=totalGamesLost;
	this.totalGamesWon=totalGamesWon;	
	this.averaage=(100*getTotalGamesWon())/ (getTotalGamesLost()+getTotalGamesWon()) ;
}


 public void setTotalGamesWon(int totalGamesWon)
 {
	 this.totalGamesWon= totalGamesWon;
 }
 
 public void setTotalGamesLost(int totalGamesLost)
 {
	 this.totalGamesLost= totalGamesLost;
 }
 
 public void setAveraage(double averaage)
 {
		this.averaage=averaage;
 }


public int getTotalGamesWon()
{
	return totalGamesWon;
}

public int getTotalGamesLost()
{
	return totalGamesLost;
}

public double getAveraage()
{
	return averaage;
}

//Chamba

public void  increaseGamesWon()
{
	setTotalGamesWon(getTotalGamesWon()+1);
}

public void increaseGamesLost()
{	
	setTotalGamesLost(getTotalGamesLost()+1);
}

public void averaage()
{
	setAveraage((100*getTotalGamesWon())/ (getTotalGamesLost()+getTotalGamesWon()));
}

public String toString()
{
	return "Total de juegos ganados: "+getTotalGamesWon()+"\n Total de juegos perdidos: "+getTotalGamesLost()+"\n Promedio"+getAveraage();
}





}
