# https://github.com/sbt/sbt/issues/7724

```
[error] Uncaught exception when running tests: java.io.InvalidClassException: sbt.ForkMain$SubclassFingerscan; local class incompatible: stream classdesc serialVersionUID = -8806153822637628239, local class serialVersionUID = 4207735866278500086
[error] sbt.ForkMain$ForkError: java.io.InvalidClassException: sbt.ForkMain$SubclassFingerscan; local class incompatible: stream classdesc serialVersionUID = -8806153822637628239, local class serialVersionUID = 4207735866278500086
[error] 	at java.base/java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:598)
[error] 	at java.base/java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:2078)
[error] 	at java.base/java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1927)
[error] 	at java.base/java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2252)
[error] 	at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1762)
[error] 	at java.base/java.io.ObjectInputStream$FieldValues.<init>(ObjectInputStream.java:2618)
[error] 	at java.base/java.io.ObjectInputStream.readSerialData(ObjectInputStream.java:2469)
[error] 	at java.base/java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2284)
[error] 	at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1762)
[error] 	at java.base/java.io.ObjectInputStream.readArray(ObjectInputStream.java:2186)
[error] 	at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1750)
[error] 	at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:540)
[error] 	at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:498)
[error] 	at sbt.ForkMain$Run.runTests(ForkMain.java:307)
[error] 	at sbt.ForkMain$Run.run(ForkMain.java:192)
[error] 	at sbt.ForkMain$Run.access$100(ForkMain.java:187)
[error] 	at sbt.ForkMain.main(ForkMain.java:178)
[error] 	at sbt.ForkMain.main(ForkMain.java:164)
```
