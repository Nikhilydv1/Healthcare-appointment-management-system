CREATE TABLE patient (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(255)
);

CREATE TABLE appointment (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    patient_id BIGINT,
    appointment_date TIMESTAMP,
    description VARCHAR(255),
    FOREIGN KEY (patient_id) REFERENCES patient(id)
);
