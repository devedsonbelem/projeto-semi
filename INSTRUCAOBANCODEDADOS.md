mongo
use bancodois;
db;
db.createCollection("users");
show collections;
```mongo=
	private String id;
	private String name;
	private String email;
	private String status;
	private String password;
```

db.users.insertMany([{name:"edson","email":"edson@gmail.com","status":"created","password":"123456"}]);

db.users.find().pretty();

db.users.createIndex({"email":1},{unique:true});

## Error
db.users.insertMany([{name:"edson","email":"edson@gmail.com","status":"created","password":"123456"}]);
## Nao pode duplicar 
##
show collections;

