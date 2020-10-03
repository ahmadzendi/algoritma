private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {                                             
  try {
    st = cn.createStatement();
    st.executeUpdate("INSERT INTO students VALUES('" + inputNis.getText() + "','"
        + inputNama.getText() + "','"
        + inputJurusan.getSelectedItem() + "','"
        + inputJK.getSelectedItem() + "','"
        + inputAlamat.getText() + "')");
    tampilData("");
    JOptionPane.showMessageDialog(null, "Simpan Berhasil");
    inputNis.setText("");
    inputNama.setText("");
    inputAlamat.setText("");
    inputJurusan.setSelectedItem("");
  } catch (Exception e) {
    e.printStackTrace();
  }
}
