// TOdoApp using MongoDB
// Create New task with Date, name, task status, time

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import org.bson.Document;

public class App{
    public static void main(String[] args) {

        var client= MongoClients.create("mongodb://localhost:27017/");
//        to create or access the database
        var todoDB = client.getDatabase("todoDB");
//        to create collection
        var todoCollection =todoDB.getCollection("todoList");

        todoDB.createCollection("todoList");

//        to access the collection
        var todoDocument = new Document();
        todoDocument.append("TaskName","work on mongoDB");
        todoDocument.append("TaskDate","13-09-2024");
        todoDocument.append("TaskTime","14hours");
        todoDocument.append("TaskStatus",false);
        todoCollection.insertOne(todoDocument);

//        to update the document
//        todoCollection.updateOne(new Document("TaskName","work on mongoDB"),new Document("$set",new Document("TaskStatus",true)));

//        change the date if status is false in all documents

//        todoCollection.updateMany(new Document("TaskName","work on mongoDB"),new Document("$set",new Document("TaskDate","15 Aug 2024")));
//        to fetch the document
        FindIterable<Document> todoList = todoCollection.find();
        for (Document document: todoList)
        {
            System.out.println("TaskName" +document.getString("TaskName")+"Task Date "+document.getString("TaskDate"));
        }

    }

}
