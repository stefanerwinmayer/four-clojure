(ns problem16)

(def test-cases
  '[(= (__ "Dave") "Hello, Dave!")
    (= (__ "Jenn") "Hello, Jenn!")
    (= (__ "Rhea") "Hello, Rhea!")])

(def __
  #(str "Hello, " % "!")
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
