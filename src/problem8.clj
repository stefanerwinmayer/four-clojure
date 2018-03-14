(ns problem8)

(def test-cases
  '[(= __ (set '(:a :a :b :c :c :c :c :d :d)))
    (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))])

(def __
  #{:a :b :c :d}
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
