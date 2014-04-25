HadoopBookPOC
=============

Hadoop code done for the book named "Hadoop: The Definitive Guide, Third Edition" by Tom White.

I have configured the entire book code in a single mavan project (without the sub modules)

This version of the code has been tested with:
 * Hadoop 1.2.1/0.22.0/0.23.x/2.2.0
 * Avro 1.5.4
 * Pig 0.8.0
 * Hive 0.8.0
 * HBase 0.90.4/0.94.15
 * ZooKeeper 3.4.2
 * Sqoop 1.4.0-incubating
 * MRUnit 0.8.0-incubating

Maven command-
% mvn package -DskipTests

By default Hadoop 1.2.1 is used. This can be changed by specifying the
hadoop.version property, e.g.

% mvn package -DskipTests -Dhadoop.version=1.2.0

There are profiles for different Hadoop major versions and distributions,
specified in hadoop-meta/pom.xml, and they are specified using the hadoop.distro
property. For example, to use the default version of Hadoop 2:

% mvn package -DskipTests -Dhadoop.distro=apache-2

Again, you can specify hadoop.version to use a particular Hadoop 2 version:

% mvn package -DskipTests -Dhadoop.distro=apache-2 -Dhadoop.version=2.1.1-beta
