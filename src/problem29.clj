(ns problem29)

(def test-cases
  '[(= (__ "HeLlO, WoRlD!") "HLOWRD")
    (empty? (__ "nothing"))
    (= (__ "$#A(*&987Zf") "AZ")])

(def __
  #(apply str (re-seq #"[A-Z]" %))
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
