(ns uptime.views.welcome
  (:require [uptime.views.common :as common])
  (use noir.core
       hiccup.core
       hiccup.page-helpers
       hiccup.form-helpers))

(defpage "/" []
         (common/layout
           [:p "Welcome to uptime"]))

(defpage "/hello" {:keys [fn ln] :as post}
				 (common/layout
				 	 [:p (str "Hola " fn " " ln " ---- " post)]))

(defpage "/user" []
         (common/layout
           (common/form "/user" "Create user" ["Firstname" :text "Lastname" :text "Password" :password])))

(defpage [:post "/user"] {:as user} 
         (common/layout
           [:p "You're trying to create a new user " user]))


