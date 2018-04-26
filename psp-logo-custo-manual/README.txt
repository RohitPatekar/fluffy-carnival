Customization workspace template: Project psp-logo-custo-manual
==================================================================

The psp-logo-custo-manual is an "old style" manual project which define what, for the moment, is not possible to define in Design Studio.

---------------------------------------------------- 

The project contains the following artifacts:
* src/main/java/com/odcgroup/example/process/HelloWorldProcess.java: A pageflow process used in a test-models pageflow.
* BLOCK-INF/block.xmap: A patch for the sitemap in order to declare a new scope key.
* BLOCK-INF/block.xml: Declaration of the cocoon block. Note that this file declares the activity "psp-logo".
* oams-profiles/Default/activity/example/menu/Menu.xml: The menu of the activity (A root menu with 4 level b menus).
* oams-profiles/Default/activity/example/sitemap.xmap: The sub sitemap of the block which declares the URL redirection for: the pageflows, the pageflow continuation, the static pages.
* oams-profiles/Default/module/example/DisplayMessageBean.xsp: This module displays the value of the property "message" of the bean HelloWorldBean stored in the scope under the key "psp-logoMessage".

----------------------------------------------------

This project uses the packaging "<packaging>wuiblock</packaging>" in its POM-xml file.
Then the wuiblocks plugin is used during the build process:
<build>
	<outputDirectory>classes</outputDirectory>
	<plugins>
		<plugin>
			<groupId>com.odcgroup.maven.plugin</groupId>
			<artifactId>maven-wuiblock-plugin</artifactId>
			<extensions>true</extensions>
		</plugin>
	</plugins>
</build>

IMPORTANT: HOW TO ADD THIS PROJECT IN A CUSTO PACKAGE
-----------------------------------------------------
To add this project in the custo packager, it is required to update the custo packager's pom this way:
1. Add a dependency to this project:
        <dependency>
            <groupId>com.odcgroup.custo</groupId>
            <artifactId>psp-logo-custo-manual</artifactId>
            <version>${project.version}</version>
			<type>wuiblock</type>
        </dependency>

2. Add this project as a module to be packaged:
            <wuiblockModule>
				  <groupId>com.odcgroup.custo</groupId>
                  <artifactId>psp-logo-custo-manual</artifactId>
            </wuiblockModule>
Example:
            <plugin>
                <groupId>com.odcgroup.maven.plugin</groupId>
                <artifactId>maven-component-plugin</artifactId>
                <extensions>true</extensions>
                <configuration>
                    <modules>
                                    ...
                        <wuiblockModule>
							<groupId>com.odcgroup.custo</groupId>
                            <artifactId>psp-logo-custo-manual</artifactId>
                        </wuiblockModule>
                              </modules>
                        </configuration>
                  </plugin>
3. Add this project in the "module" pom (located in module-pom/pom.xml of the custo packager project)
      <module>../../psp-logo-custo-manual</module>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.odcgroup.custo</groupId>
  <artifactId>custo-pms</artifactId>
  <version>5.0</version>
  <packaging>pom</packaging>

  <modules>
      <module>../../pms-custo-models</module>
      <module>../../pms-models-gen</module>
      <module>../../custo-pms-packager</module>
      <module>../../psp-logo-custo-manual</module>
  </modules>
  
</project>
