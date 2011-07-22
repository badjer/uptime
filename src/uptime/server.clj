(ns uptime.server
  (:require [noir.server :as server]))

(server/load-views "src/uptime/views/")

(defn env [name]
  (get (System/getenv) name))

(def DB_SERVER (env "CLOUDANT_URL"))

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer/parseInt (or (env "PORT") "8080"))]
    (server/start port {:mode mode
                        :ns 'uptime})))

