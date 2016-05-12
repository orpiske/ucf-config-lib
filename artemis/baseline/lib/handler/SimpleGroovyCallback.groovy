package samples

/**
 * Created by opiske on 5/10/16.
 */

class SimpleGroovyCallback {

    def beforeCommit(Map<String, Object> context) {
        String admin = context.get("admin");
        String artemis_home = context.get("artemis_home");

        println("Bla bla bla ... stopping the program for $admin: $artemis_home/bin/artemis stop")
    }

    def afterCommit(Map<String, Object> context) {
        String admin = context.get("admin");
        String artemis_home = context.get("artemis_home");

        println("Bla bla bla ... restarting the program for $admin: $artemis_home/bin/artemis restart")
    }
}
