# MongoDB 
For this assignment we were to familiarize ourselves with MongoDB by following its 
[official tutorial](https://www.mongodb.com/lp/cloud/atlas/try4?utm_source=google&utm_campaign=search_gs_pl_evergreen_atlas_general_prosp-brand_gic-null_emea-no_ps-all_desktop_eng_lead&utm_term=mongodb%20tutorial&utm_medium=cpc_paid_search&utm_ad=e&utm_ad_campaign_id=10947982929&adgroup=108885994073&cq_cmp=10947982929&gad_source=1&gclid=Cj0KCQjwo8S3BhDeARIsAFRmkOPaCjYHQO-d60uTbQanbkmwg_Q4M_HFA0gDrgjddgf-EpDv1_p1mWsaAjq-EALw_wcB).

I started with reading the [introduction page](https://www.mongodb.com/docs/manual/introduction/) before doing this 
[tutorial](https://www.mongodb.com/docs/manual/tutorial/getting-started/). 

## Installing MongoDB
I followed the [instructions](https://www.mongodb.com/docs/manual/administration/install-community/) for installing 
MongoDB. 

### Verifying the Integrity of MongoDB Package
I followed [this](https://www.mongodb.com/docs/manual/tutorial/verify-mongodb-packages/) when verifying the MongoDB package before starting the installation. 

I created a file in my Downloads called XXX and pasted in
> 778f03552b6638822c18a9a2e8996d31cf12e4c9b87ffc73be8ce71e0a8465e9  mongodb-windows-x86_64-8.0.0.msi

Then I opened Windows PowerShell and ran the command 

```
$sigHash = (Get-Content $Env:HomePath\Downloads\mongodb-windows-x86_64-8.0.0-signed.msi.sha256 | Out-String).SubString(0,64).ToUpper(); `
$fileHash = (Get-FileHash $Env:HomePath\Downloads\mongodb-windows-x86_64-8.0.0-signed.msi).Hash.Trim(); `
echo $sigHash; echo $fileHash; `
$sigHash -eq $fileHash
```

But for some reason, it couldn't find the file I'd saved. You can see in the print screen below that I had it correctly.

![img_2.png](img_2.png)

The name of and the path to the file is correct, the SHA is for the correct version of MongoDB, and the two SHA's are 
identical once you set everything to upper case. 

I decided not to waste too much time on figuring out what went wrong and decided to continue downloading.
Note that I would NOT have skipped the verification had it been a file from a less reliable source. 

### Installation

All went well with downloading the
[Windows version](https://www.mongodb.com/docs/manual/tutorial/install-mongodb-on-windows/#std-label-install-mdb-community-windows); 
I ran the executable which started the installing process (with the default settings) and added the path in my 
environmental variables. 

But when it came to actually launching it, I encountered my first obstacle. When following these installation 
[instructions](https://www.mongodb.com/docs/manual/tutorial/install-mongodb-on-windows/#run-mongodb-from-cmd), I got 
all the way to _Step 2 "Start your MangoDB database"_, before having to stop and check that everything had been done 
correctly. 

After creating the new directory `\data\db` inside `C:\`, I ran 
`"C:\Program Files\MongoDB\Server\8.0\bin\mongod.exe" --dbpath="c:\data\db"` and got this output: 

![img.png](img.png)

This confused me since I did not get the output: `[initandlisten] waiting for connections` which it said should be 
displayed in the command interpreter if the MangoDB database was running correctly.

So, I uninstalled the program and instead followed this [tutorial](https://www.geeksforgeeks.org/how-to-install-mongodb-on-windows/) 
from GeeksForGeeks, and simultaneously this [tutorial](https://www.youtube.com/watch?v=gB6WLkSrtJk) where they point
out that the _MongoDB Shell_ needed to be downloaded separately.

After downloading and installing the shell via this [link](https://www.mongodb.com/docs/mongodb-shell/install/), I kept
reading the GeeksForGeeks tutorial, where they explained that the output I got the first time, after running the command
`"C:\Program Files\MongoDB\Server\8.0\bin\mongod.exe" --dbpath="c:\data\db"`, was in fact, just the MongoDB server 
running. 

I also figured out, thanks to this [question](https://stackoverflow.com/questions/73081708/mongo-exe-not-installed-in-version-6-0-0/73208435#73208435) 
from StackOverflow, that the correct command for starting the shell is `mongosh` and not `mongo`.

![img_1.png](img_1.png)

Now, that I got the server running and had connected to the shell, I opened _MongoDB Compass_, a Graphical User
Interface (GUI) which acts like a client for the MongoDB server. And to connect to the default MongoDB Server database, 
I used the default URL: `mongodb://localhost:27017`.

![img_3.png](img_3.png)

Once I connected the server and client for MongoDB, I created a new database and started to explore the CURD (create, 
update, read, delete) operations. 





---
In particular, you should write about:

    Technical problems that you encountered during installation and use of MongoDB and how you resolved

    Screenshots for:

        The correct validation of the installation package (https://docs.mongodb.com/manual/tutorial/verify-mongodb-packages/)

        Relevant results obtained during Experiment 1 (it is not necessary to put a single screenshot on each substep, 
        but at least one significant from each CRUD operation).

        Experiment 2 example working and the additional Map-reduce operation (and its result) developed by each of you.

        Reason about why your implemented Map-reduce operation in Experiment 2 is useful and interpret the collection 
        obtained.

        Any pending issues with this assignment which you did not manage to solve

The hand-in should be written in English.