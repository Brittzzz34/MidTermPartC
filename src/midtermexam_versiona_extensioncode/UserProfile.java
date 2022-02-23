/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

/**
 * The user profile for the OnlineVids system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author dancye, 2019
 */
public class UserProfile
{
    
    private String userID;//the userID
    private String genre;// the user's preferred genre of movie
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
    
    
    public UserProfile()    {
        this("BRITTANY", "LOVE");
    }
    
    
    public UserProfile(String givenID, String givenGenre)    {
        userID = givenID;
        genre= givenGenre;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    public void genreTypes() {        
        for (int i = 0; i<genres.length; i++){
            
            System.out.println(genres[i]);
            System.out.println("genres["+i+"]="+genres[i]);
        }
    }
    
}//end class
