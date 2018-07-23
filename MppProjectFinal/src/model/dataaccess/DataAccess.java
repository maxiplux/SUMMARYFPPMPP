package model.dataaccess;

import java.util.HashMap;

import model.domain.Book;
import model.domain.LibraryMember;
import model.domain.Person;
import model.domain.User;

public interface DataAccess {
	public HashMap<String,Book> readBooksMap();
	public HashMap<String,Person> readPeopleMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
	public void saveNewMember(LibraryMember member);
}
