
//Creating REST API using Spring Boot
// check this YouTube video for more details: https://www.youtube.com/watch?v=rxT5RFYxjSg&list=PLA3GkZPtsafacdBLdd3p1DyRd5FGfr3Ue&index=9

// Basic Rule For Coding

->> controller ---> service ---> repository


// MongoDb

Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

Install the latest PowerShell for new features and improvements! https://aka.ms/PSWindows

PS C:\Users\Rishabh Yadav> mongosh
Current Mongosh Log ID: 69d6c123efcefe975b3682d0
Connecting to:          mongodb://127.0.0.1:27017/?directConnection=true&serverSelectionTimeoutMS=2000&appName=mongosh+2.8.2
Using MongoDB:          8.2.6
Using Mongosh:          2.8.2

For mongosh info see: https://www.mongodb.com/docs/mongodb-shell/

------
The server generated these startup warnings when booting
2026-04-07T18:10:40.371+05:30: Access control is not enabled for the database. Read and write access to data and configuration is unrestricted
------

test> show dbs
admin   40.00 KiB
config  36.00 KiB
local   40.00 KiB
test> show dbs
admin   40.00 KiB
config  72.00 KiB
local   40.00 KiB
test> show dbs
admin      40.00 KiB
config     72.00 KiB
journaldb   8.00 KiB
local      40.00 KiB
test> use journaldb
switched to db journaldb
journaldb> show collections
journal_entries
journaldb> db.journal_entried.find()

journaldb> db.journal_entries.find()
[
{
_id: ObjectId('69d6c1adec48533f642fa19f'),
title: '!ok',
content: 'I just !ok',
_class: 'net.engineeringdigest.journalApp.entity.JournalEntry'
}
]
journaldb> db.journal_entries.delete
db.journal_entries.deleteMany  db.journal_entries.deleteOne

journaldb> db.journal_entries.delete
db.journal_entries.deleteMany  db.journal_entries.deleteOne

journaldb> db.journal_entries.deleteAll
journaldb.journal_entries.deleteAll
journaldb> show collections
journal_entries
journaldb> db.journal_entries.find()
[
{
_id: ObjectId('69d6c1adec48533f642fa19f'),
title: '!ok',
content: 'I just !ok',
_class: 'net.engineeringdigest.journalApp.entity.JournalEntry'
},
{
_id: ObjectId('69d6cefc368e82bc3f3c5c0a'),
title: '!ok2',
content: 'I just !ok2',
date: ISODate('2026-04-08T21:56:12.108Z'),
_class: 'net.engineeringdigest.journalApp.entity.JournalEntry'
}
]
journaldb> db.journal_entries.delete
db.journal_entries.deleteMany  db.journal_entries.deleteOne

journaldb> db.journal_entries.deleteMany
[Function: deleteMany] AsyncFunction {
apiVersions: [ 1, Infinity ],
returnsPromise: true,
serverVersions: [ '0.0.0', '999.999.999' ],
topologies: [ 'ReplSet', 'Standalone', 'Sharded', 'LoadBalanced' ],
returnType: { type: 'unknown', attributes: {} },
deprecated: false,
platforms: [ 'Compass', 'Browser', 'CLI' ],
isDirectShellCommand: false,
acceptsRawInput: false,
shellCommandCompleter: undefined,
newShellCommandCompleter: undefined,
help: [Function (anonymous)] Help
}
journaldb> db.journal_entries.find()
[
{
_id: ObjectId('69d6c1adec48533f642fa19f'),
title: '!ok',
content: 'I just !ok',
_class: 'net.engineeringdigest.journalApp.entity.JournalEntry'
},
{
_id: ObjectId('69d6cefc368e82bc3f3c5c0a'),
title: '!ok2',
content: 'I just !ok2',
date: ISODate('2026-04-08T21:56:12.108Z'),
_class: 'net.engineeringdigest.journalApp.entity.JournalEntry'
}
]
journaldb> db.journal_entries.deleteMany()
MongoshInvalidInputError: [COMMON-10001] Missing required argument at position 0 (Collection.deleteMany)
journaldb> db.journal_entries.deleteMany({})
{ acknowledged: true, deletedCount: 2 }
journaldb> db.journal_entries.find()

journaldb> db.journal_entries.find()
[
{
_id: ObjectId('69d6d051368e82bc3f3c5c0b'),
title: '!ok',
content: 'I just !ok',
date: ISODate('2026-04-08T22:01:53.934Z'),
_class: 'net.engineeringdigest.journalApp.entity.JournalEntry'
}
]
journaldb> db.journal_entries.find()
[
{
_id: ObjectId('69d6d108368e82bc3f3c5c0c'),
title: '!ok',
content: 'I just !ok',
date: ISODate('2026-04-08T22:04:56.479Z'),
_class: 'net.engineeringdigest.journalApp.entity.JournalEntry'
}
]