(ns uptime.views.common
  (use noir.core
       hiccup.core
       hiccup.page-helpers
       hiccup.form-helpers))

(defpartial layout [& content]
            (html5
              [:head
               [:title "uptime"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))

(defpartial field [name type]
            [:label {:for name} name]
            [:input {:type type :name name}])

(defpartial form [url savetext & fields]
            (form-to [:post url]
                     (for [[name type] fields] (field name type))
                     (submit-button savetext)))
                     
