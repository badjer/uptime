(ns uptime.server
  (:require [noir.server :as server]))

(server/load-views "src/uptime/views/")

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer/parseInt (or (second m) 8080))]
    (server/start port {:mode mode
                        :ns 'uptime})))

