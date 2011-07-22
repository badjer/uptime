(ns uptime.views.welcome
  (:require [uptime.views.common :as common])
  (use noir.core
       hiccup.core
       hiccup.page-helpers))

(defpage "/" []
         (common/layout
           [:p "Welcome to uptime"]))

(defpage "/hello" {:keys [fn ln] :as post}
				 (common/layout
				 	 [:p (str "Hello " fn " " ln " ---- " post)]))
